grammar LibExpr;
import CommonLexerRules;  // include all rules from CommonLexerRules.g4

/**
 * The start rule; begin parsing here
 */
prog: stat+ ;

stat: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;

expr: expr ( '*' | '/' ) expr
    | expr ( '+' | '-' ) expr
    | INT
    | ID
    | '(' expr ')'
    ;

