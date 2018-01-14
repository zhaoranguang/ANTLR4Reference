grammar SimplePy;

@lexer::members {
    int nesting = 0;
}

file
    : stat+ EOF;

stat
    : assign NEWLINE
    | expr NEWLINE
    | NEWLINE
    ;

assign
    : ID '=' expr;

expr
    : expr '+' expr
    | '(' expr ')'
    | call
    | list
    | ID
    | INT
    ;

call
    : ID '(' (expr (',' expr)* )? ')'
    ;

list
    : '[' expr (',' expr)*']'
    ;

ID  : [a-zA-Z_] [a-zA-Z_0-9]* ;

/** Nested newline withing a (..) or [..] are ignored
 *
 */
IGNORE_NEWLINE
    : '\r'? '\n' {nesting > 0}? -> skip;

/** A logical newline that ends a statement */
NEWLINE
    : '\r'? '\n'
    ;

/** WARNING: doesn't handle INDENT/DEDENT Python rules */
WS  : [ \t] -> skip;

/** Match comments. Don't match \n here; we'll send NEWLINE to the parser */
COMMENT
    : '#' ~[\r\n]* -> skip;

/** Ignore backslash newline sequences. This disallows comments
 * after the backslash because newline must occure next
 */
LINE_ESCAPE
    : '\\' '\r'? '\n' -> skip
    ;


LPAREN : '('  {nesting++;} ;
RPAREN : ')'  {nesting--;} ;
LBRACK : '['  {nesting++;} ;
RBRACK : ']'  {nesting--;} ;
INT  : [0-9]+ ;
