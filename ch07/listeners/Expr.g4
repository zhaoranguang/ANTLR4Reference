grammar Expr;
s   : e ;
e   : e op=MULT e
    | e op=ADD e
    | INT
    ;

MULT: '*' ;
ADD : '+' ;
INT : [0-9]+ ;
WS  : [ \t\n]+ -> skip;
