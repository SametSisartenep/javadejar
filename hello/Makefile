JC=javac
JR=java
JFLAGS=-classpath .
O=class

TARG=eu.atl.main.HelloWorld
OFILES=\
	eu/atl/main/HelloWorld.$O\
	eu/atl/main/Scale.$O\
	eu/atl/main/Point.$O\
	eu/atl/main/Rectangle.$O\
	eu/atl/err/Hunchback.$O\

.PHONY: all clean
all: $(TARG)

%.class: %.java
	$(JC) $(JFLAGS) $<

$(TARG): $(OFILES)

run:
	$(JR) $(TARG)

clean:
	rm $(OFILES)
