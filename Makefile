SRC_DIR = sources
SRC_PKG = mypackage
SOURCES_TXT = sources.txt
PKG_DIR = mypackage

all: compile

$(SOURCES_TXT):
	@echo "Generating $(SOURCES_TXT)..."
	@find $(SRC_PKG) -name "*.java" > $(SOURCES_TXT)
	@find $(SRC_DIR) -name "*.java" >> $(SOURCES_TXT)

compile: $(SOURCES_TXT)
	@echo "Compaling files..."
	@javac @$(SOURCES_TXT)

clean:
	@echo "Cleaning .class files"
	@find $(SRC_DIR) -name "*.class" -delete
	@find $(PKG_DIR) -name "*.class" -delete
	@rm -f $(SOURCES_TXT)

.PHONY: all compile clean