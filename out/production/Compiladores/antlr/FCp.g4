grammar FCp;

RESERVED_WORDS: 'START'  | 'IF' | 'ELSE' | 'WHILE' |'INPUT' | 'OUTPUT' ;
INT_TYPE: 'INT';
FLOAT_TYPE: 'FLOAT';
BOOLEAN_TYPE: 'BOOL';
STRING_TYPE: 'STRING';
END: 'END';
SEMICOLON: ';';
OP_PAR: '(';
CL_PAR: ')';
OP_BRA: '{';
CL_BRA: '}';

BOOLEAN_VALUES: 'TRUE' | 'FALSE';

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;

ASSIGNMENT_OP: '='  ;
ADD_OP: '+' | '-' ;
MULT_OP: '*' | '**' | '/' | '%' ;
REL_OP: '>' | '>=' | '<' | '<=' ;
EQU_OP: '==' | '!=';
LOGICAL_OP: '&&' | '||';
SINAL : '+' | '-';

INT_VALUES: ('+' | '-')? ('0' .. '9')+;
FLOAT_VALUES: ('+' | '-')? ('0' .. '9')+ '.' ('0' .. '9')+;

STRING_VALUES: '"' ( ~["\\] | '\\' . )* '"';


WS: (' ' | '\t' | '\r' | '\n') -> skip;

LINE_COMMENT: '#' ~[\r\n]* -> skip;
BLOCK_COMMENT :   '/*' .*? '*/' -> skip;

start: 'START' SEMICOLON cmdList* END SEMICOLON EOF ;
cmdList: declaration | assignment | exeCmd  ;
declaration: (INT_TYPE IDENTIFIER SEMICOLON ) |
             (FLOAT_TYPE IDENTIFIER SEMICOLON ) |
             (STRING_TYPE IDENTIFIER SEMICOLON ) |
             (BOOLEAN_TYPE IDENTIFIER SEMICOLON ) |
             (INT_TYPE IDENTIFIER '=' mathExp SEMICOLON ) |
             (FLOAT_TYPE IDENTIFIER '=' mathExp SEMICOLON ) |
             (STRING_TYPE IDENTIFIER '=' STRING_VALUES SEMICOLON ) |
             (BOOLEAN_TYPE IDENTIFIER '=' relExp SEMICOLON );

mathExp: mathTerm ((ADD_OP | MULT_OP) mathTerm)*;
mathTerm: INT_VALUES | FLOAT_VALUES | IDENTIFIER | '(' mathExp ')';

relExp: relTerm ((LOGICAL_OP| EQU_OP | REL_OP) relTerm)*;
relTerm: mathExp | BOOLEAN_VALUES | '(' relExp ')';

assignment: IDENTIFIER ASSIGNMENT_OP (mathExp |  relExp | STRING_VALUES) SEMICOLON;

exeCmd: inputCmd | outputCmd | whileCmd | ifCmd ;

inputCmd: 'INPUT' IDENTIFIER SEMICOLON;

outputCmd: 'OUTPUT' (IDENTIFIER | STRING_VALUES) SEMICOLON;

whileCmd: 'WHILE' OP_PAR relExp CL_PAR OP_BRA cmdList* CL_BRA;

ifCmd: 'IF' '(' relExp ')' '{' cmdList* '}' elseCmd?;
elseCmd: 'ELSE' '{' cmdList* '}';