//TODO
// adding relational operators
// add other pi syntaxes
// more processes as input
// Assigning processes


grammar sessionPi;

process:
      CAPS'[' process (SEQ process)* ']'                                # sequentialProcess
    | scopeRestrict process                                             # scopeRestriction
    | send                                                              # sendProcess
    | receive                                                           # receiveProcess
    | VAR SELECT STRING SEQ process                                     # selectProcess
    | VAR BRANCH '{' (STRING ':' process ',')* STRING ':' process '}'   # branchProcess
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
    | VAR                                   # channelPayload
    ;


scopeSession: NEW x=VAR y=VAR;

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
NULL: '0';
PARALLEL: '|';
SELECT: 'select';
BRANCH:'branch';
SEQ: '.';
NEW: 'new';
VAR: [a-z]{1};
INT: [0-9]+;
STRING: '"'(.)*?'"' ; // . matches any character except line breaks
FLOAT: [0-9]+'.'[0-9]+;
CAPS: [A-Z]{1};
WS : [ \t\r\n]+ -> skip ;