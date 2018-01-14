grammar IDKeyword;

prog
    : stat+ ;

stat
    : 'if' expr 'then' stat
    | 'call' id ';'
    | ';'
    ;

expr
    : id ;

id
    : 'if' | 'call' | 'then' | ID ;

ID  : [a-z]+ ;
WS  : [ \t\r\n]+ -> skip;

