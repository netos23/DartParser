lexer grammar BaseDartLexer;

options { superClass=DartLexerBase; }


BOOL_LITERAL:  TRUE_ | FALSE_;

ABSTRACT_:'abstract';
AS_:'as';
ASSERT_:'assert';
ASYNC_:'async';
AWAIT_:'await';
BREAK_:'break';
CASE_:'case';
CATCH_:'catch';
CLASS_:'class';
CONST_:'const';
CONTINUE_:'continue';
COVARIANT_:'covariant';
DEFAULT_:'default';
DEFERRED_:'deferred';
DO_:'do';
DYNAMIC_:'dynamic';
ELSE_:'else';
ENUM_:'enum';
EXPORT_:'export';
EXTENDS_:'extends';
EXTENSION_:'extension';
EXTERNAL_:'external';
FACTORY_:'factory';
FALSE_:'false';
FINAL_:'final';
FINALLY_:'finally';
FOR_:'for';
FUNCTION_:'Function';
GET_:'get';
GTILDE_:'gtilde';
HIDE_:'hide';
IF_:'if';
IMPLEMENTS_:'implements';
IMPORT_:'import';
IN_:'in';
INTERFACE_:'interface';
IS_:'is';
LATE_:'late';
LET_:'let';
LIBRARY_:'library';
MIXIN_:'mixin';
NATIVE_:'native';
NEW_:'new';
NULL_:'null';
OF_:'of';
ON_:'on';
OPERATOR_:'operator';
PART_:'part';
REQUIRED_:'required';
RETHROW_:'rethrow';
RETURN_:'return';
SET_:'set';
SHOW_:'show';
STATIC_:'static';
SUPER_:'super';
SWITCH_:'switch';
SYNC_:'sync';
THIS_:'this';
THROW_:'throw';
TRUE_:'true';
TRY_:'try';
TYPEDEF_:'typedef';
VAR_:'var';
VOID_:'void';
WHILE_:'while';
WITH_:'with';
YIELD_:'yield';


SC: ';';
CO: ':';

A: '&';
AA: '&&';
AE: '&=';
AT: '@';
C: ',';
CIR: '^';
CIRE: '^=';
ME: '-=';
MINUS: '-';
MM: '--';
NE: '!=';
NOT: '!';
P: '|';
PC: '%';
PE: '%=';
PL: '+';
PLE: '+=';
PLPL: '++';
PO: '#';
POE: '|=';
PP: '||';
QU: '?';
QUD: '?.';
QUDD: '?..';
QUQU: '??';
QUQUEQ: '??=';

SE: '/=';
SL: '/';
SQS: '~/';
SQSE: '~/=';
SQUIG: '~';
ST: '*';
STE: '*=';

D: '.';
DD: '..';
DDD: '...';
DDDQ: '...?';

NUMBER : DIGIT+ ( '.' DIGIT+ )?;

fragment LETTER : 'a' .. 'z' | 'A' .. 'Z' ;
fragment DIGIT: '0' .. '9';

EQ: '=';
fragment EE: '==';
EG: '=>';
fragment GT: '>';
fragment LT: '<';
fragment LTE: '<=';

CP: ')';
OP: '(';
OBC: '{';
CBC: '}';
OB: '[';
CB: ']';

CMP: EE | EG  | GT | LT | LTE;

WS : [ \t\r\n]+ -> skip;
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT : '/*' ( MULTI_LINE_COMMENT | . )*? '*/'  -> skip ;

fragment IDENTIFIER_START : LETTER | '_' | '$';
fragment IDENTIFIER_PART : IDENTIFIER_START | DIGIT ;

IDENTIFIER : IDENTIFIER_START IDENTIFIER_PART* ;

fragment StringDQ : '"' StringContentDQ*? '"' ;
fragment StringContentDQ : ~('\\' | '"' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringDQ | '${' StringContentDQ*? '}' | '$' { CheckNotOpenBrace() }? ;
fragment StringSQ : '\'' StringContentSQ*? '\'' ;
fragment StringContentSQ : ~('\\' | '\'' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringSQ | '${' StringContentSQ*? '}' | '$' { CheckNotOpenBrace() }? ;
fragment StringContentTDQ : ~('\\' | '"') | '"' ~'"' | '""' ~'"' ;
fragment StringContentTSQ : '\'' ~'\'' | '\'\'' ~'\'' | . ;


VALUE: NUMBER | StringDQ | StringSQ | BOOL_LITERAL;
