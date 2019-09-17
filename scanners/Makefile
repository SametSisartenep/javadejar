JC=javac
JR=java
JFLAGS=-classpath .
O=class

TARG=eu.atl.main.Main
OFILES=\
	eu/atl/main/Main.$O\

.PHONY: all clean
all: $(TARG)

%.class: %.java
	$(JC) $(JFLAGS) $<

$(TARG): $(OFILES)

run:
	$(JR) $(TARG)

clean:
	rm $(OFILES)
