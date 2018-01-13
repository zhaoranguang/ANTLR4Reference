grammar Cymbol ;

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
    : ID '(' exprList? ')'  // func call like f(), f(x), f(1,2)
    | ID '[' expr ']'       // array index like a[i], a[i][j]
    | '-' expr              // unary minus
    | '!' expr              // boolean not
    | expr '*' expr         // multiply
    | expr ('+'|'-') expr
    | expr '==' expr        // equality comparison
    | ID
    | INT
    | '(' expr ')'
    ;
exprList
    : expr (',' expr)* ;    // arg list

ID        : LETTER (LETTER|DIGIT)* ;
fragment LETTER : [a-zA-Z\u0080-\u00FF] ;
fragment DIGIT  : [0-9] ;
INT       : '-'? DIGIT+ ;
