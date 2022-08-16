//TODO
// adding relational operators
// add other pi syntaxes
// more processes as input
// Assigning processes

//TODO Pi types
grammar sessionPi;

process:
      CAPS'[' process (SEQ process)* ']'                                # sequentialProcess
    | scopeRestrict process                                             # scopeRestriction
    | send                                                              # sendProcess
    | receive                                                           # receiveProcess
    | VAR SELECT IDENTIFIER SEQ process                                     # selectProcess
    | VAR BRANCH '{' (branch ',')* branch '}'   # branchProcess
    | process PARALLEL process                                          # parallel
    | scopeSession process                                              # scopeSessionLabel
    | NULL                                                              # inaction
    ;

scopeRestrict: NEW c=VAR;

send: channel=VAR '<' payload '>';

receive: channel=VAR '(' payload ')';

payload:
    expr                                    # exprPayload
    |values                                 # stringPayload
    | VAR                                   # varPayload
    ;


scopeSession: NEW x=VAR y=VAR;

branch: IDENTIFIER ':' process;

expr:
      expr op=('*'|'/') expr
    | expr op=('+'|'-') expr
    | expr op='==' expr
    | INT
    | bool;

bool:
      'TRUE'
    | 'FALSE'
    | 'true'
    | 'false'
    ;

values:
      INT
    | FLOAT
    | STRING
    | bool
    ;

// Lexer Rules
NULL: 'zero';
PARALLEL: '|';
SELECT: 'select';
BRANCH:'branch';
SEQ: '.';
NEW: 'new';
VAR: [a-z]{1};
INT: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
CAPS: [A-Z]{1};
IDENTIFIER: [a-z0-9][a-z0-9]*;
STRING: '"'(.)*?'"' ; // . matches any character except line breaks
WS : [ \t\r\n]+ -> skip ;