grammar BaseDartGramma;

value: number | '"' (symbol | digit | letter)* '"' | '\'' (symbol | digit | letter)* '\'';

identifier :  letter (letter | digit | '_' )+;

letter  : 'a' .. 'z' | 'A' .. 'Z' ;
symbol : '[' | '\\' | ']' | '^' | '_' | '`' | ' ' | '!' | '?' | '.' ;

digit: '0' .. '9' ;

number: digit+ ('.' digit+)? ;

comporator: '==' | '!=' | '<' | '>' | '<=' | '>=' ;

ws : ' '| '\t' |'\r'|'\n';