//TODO
// adding relational operators
// add other pi syntaxes
// more processes as input
// Assigning processes

grammar sessionPi;

process:
      CAPS'[' process ']' (SEQ process)?    #sequentialProcess
    | scopeRestrict process                 # scopeRestriction
    | send SEQ process                      # sendProcess
    | receive SEQ process                   # receiveProcess
    | process PARALLEL process              # parallel
// Session processes
    | scopeSession process                  # scopeSessionLabel
    | NULL                                  # inaction
    ;

scopeRestrict: NEW c=CHANNEL;

send: channel=CHANNEL '!<' payload '>';

receive: channel=CHANNEL '?(' payload ')';

payload:
    expr                                    # exprPayload
    |values                                 # stringPayload
    | CHANNEL                               # channelPayload
    ;


scopeSession: NEW x=CHANNEL y=CHANNEL;

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
SEQ: '.';
NEW: 'new';
CHANNEL: [a-z]{1};
INT: [0-9]+;
STRING: '"'(.)*?'"' ; // . matches any character except line breaks
FLOAT: [0-9]+'.'[0-9]+;
CAPS: [A-Z]{1};
WS : [ \t\r\n]+ -> skip ;