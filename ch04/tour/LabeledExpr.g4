grammar LabeledExpr;
import CommonLexerRules;  // include all rules from CommonLexerRules.g4

/**
 * The start rule; begin parsing here
 */
prog: stat+ ;

stat: expr NEWLINE                 # printExpr
    | ID '=' expr NEWLINE          # assign
    | NEWLINE                      # blank
    ;

expr: expr ( '*' | '/' ) expr      # MulDiv
    | expr ( '+' | '-' ) expr      # AddSub
    | INT                          # int
    | ID                           # id
    | '(' expr ')'                 # parens
    ;

MUL : '*' ;   // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;



