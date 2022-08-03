//TODO adding relational operators
// add other pi syntaxes
grammar sessionPi;

process:
     '(' process SEQ process ')'            #sequentialProcess
    | process PARALLEL process              # parallel
    | NULL                                  # inaction
    | scopeRestrict process                 # scopeRestriction
    | send SEQ process                      # sendProcess
    | receive SEQ process                   # receiveProcess
// Session processes
    | scopeSession process                  # scopeSessionLabel
    ;

scopeRestrict: NEW c=CHANNEL;

send: channel=CHANNEL '!<' payload '>';

receive: channel=CHANNEL '?(' payload ')';

payload:
      CHANNEL                             # channelPayload
    | values                              # stringPayload
    | expr                                # exprPayload
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
CHANNEL: [a-zA-Z]{1};
INT: [0-9]+;
STRING: '"'(.)*?'"' ; // . matches any character except line breaks
FLOAT: [0-9]+'.'[0-9]+;
