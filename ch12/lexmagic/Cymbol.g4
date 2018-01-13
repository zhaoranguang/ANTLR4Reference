grammar Cymbol ;

@lexer::members {
    public static final int WHITESPACE = 1;
    public static final int COMMENTS = 2;
}

file    : (functionDecl | varDecl)+ ;

varDecl
    : type ID ('=' expr)? ';'
    ;

type    : 'float' | 'int' | 'void' ; // user-defined type

functionDecl
    : type ID '(' formalParameters? ')' block    // "void f(int x) {...}"
    ;

formalParameters
    : formalParameter (',' formalParameter)*
    ;

formalParameter
    : type ID
    ;

block  : '{' stat* '}' ;    // possibly empty statement block

stat
    : block
    | varDecl
    | 'if' expr 'then' stat ('else' stat)?
    | 'return' expr? ';'
    | expr '=' expr ';'     // assignment
    | expr ';'              // func call
    ;

expr
    : ID '(' exprList? ')'  # Call     // func call like f(), f(x), f(1,2)
    | ID '[' expr ']'       # Index    // array index like a[i], a[i][j]
    | '-' expr              # Negate   // unary minus
    | '!' expr              # Not      // boolean not
    | expr '*' expr         # Mult     // multiply
    | expr ('+'|'-') expr   # AddSub   //
    | expr '==' expr        # Equal    // equality comparison
    | ID                    # Var
    | INT                   # Int
    | '(' expr ')'          # Parens
    ;

exprList
    : expr (',' expr)* ;    // arg list

K_FLOAT : 'float';
K_INT   : 'int';
K_VOID  : 'void';

ID              : LETTER (LETTER|DIGIT)* ;
fragment LETTER : [a-zA-Z\u0080-\u00FF] ;
INT             : '-'? DIGIT+ ;
fragment DIGIT  : [0-9] ;

WS              : [ \t\n\r]+ -> channel(1);

SL_COMMENT      : '//' .*? '\r'? '\n' -> channel(2); // Match "//" stuff '\n'

COMMENT         : '/*' .*? '*/'       -> skip; // Match "/*" stuff "*/"
