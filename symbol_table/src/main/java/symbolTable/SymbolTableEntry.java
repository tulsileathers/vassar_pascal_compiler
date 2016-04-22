package symbolTable;

import lex.TokenType;

public class SymbolTableEntry {

	String name;
	boolean reserved = false;
	TokenType type;

	public SymbolTableEntry () {}
	
	public SymbolTableEntry (String name) {
		this.name = name.toUpperCase();
	} 
	
	public SymbolTableEntry (String name, TokenType type) {
		this.name = name.toUpperCase();
		this.type = type;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TokenType getType() {
		return type;
	}
	public void setType(TokenType type) {
		this.type = type;
	}

	public boolean isVariable() { return false; } 
	public boolean isKeyword() { return false; } 
	public boolean isProcedure() { return false; } 
	public boolean isFunction() { return false; } 
	public boolean isFunctionResult() { return false; }  
	public boolean isParameter() { return false; }  
	public boolean isArray() { return false; } 
	public boolean isConstant() { return false; }
	public boolean isReserved() { return reserved; }
	
}
