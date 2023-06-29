parser grammar DartFuncGrammaParser;

options { tokenVocab=BaseDartLexer; }

type :  IDENTIFIER;

parameter : type IDENTIFIER /*| '[' type IDENTIFIER '=' VALUE ']'*/;
classCall: (VALUE | IDENTIFIER) D functionalCall;
optionalParametr: type IDENTIFIER EQ VALUE;

optionalParametrs:  optionalParametr  ((C optionalParametr)*)? ;

parameters: parameter ((C parameter)*)? (C? | ( (C OB optionalParametrs C? CB) | (C OBC optionalParametrs C? CBC))?);

function : (VOID_ | type)  IDENTIFIER OP parameters? CP  block ;

constructor :  IDENTIFIER OP parameters? CP  (block | SC) ;
namedConstructor :  IDENTIFIER D IDENTIFIER OP parameters? CP  (block | SC) ;

functionalCall: IDENTIFIER OP values? CP;

statement: (functionalCall | assignment | loop | declaration | if | classCall);

loop : (FOR_ OP declaration SC condition SC expression CP block) |
       (WHILE_ OP condition CP block);

if: IF_ OP condition CP block (ELSE_ (statement SC | block))?;

block: OBC (statement SC)* CBC ;

condition: (expression CMP expression) |  BOOL_LITERAL;

typeDeclaration: type | FINAL_ | VAR_ | DYNAMIC_ | (FINAL_ type);

declaration: (LATE_? typeDeclaration assignment) | (LATE_? typeDeclaration IDENTIFIER);

assignment: IDENTIFIER EQ expression ;

expression : term (signPM term)* | increment;
signPM : (PL|MINUS);
signTL : (ST|SL);

increment: (IDENTIFIER MM) | (MM IDENTIFIER) | (IDENTIFIER PLPL)| (PLPL IDENTIFIER);
term : factor (signTL factor)* ;
factor : functionalCall | NUMBER | VALUE   | ('(' expression ')')  | IDENTIFIER;

values : (expression |IDENTIFIER | VALUE | ) ((C (expression | IDENTIFIER | VALUE))*)?;

field: declaration SC;

getter: type GET_ IDENTIFIER (EG expression SC)? ;


setter:  SET_ IDENTIFIER OP type IDENTIFIER CP ((EG expression SC) | block)?;


class: ABSTRACT_? CLASS_ IDENTIFIER (EXTENDS_ type)? (WITH_ type)? (IMPLEMENTS_ type)? OBC
    classBody
CBC;

classBody: (function | field  | constructor | namedConstructor | getter | setter)*;

import_: IMPORT_ VALUE;

topLavelStatement: (function | declaration | class)*;






