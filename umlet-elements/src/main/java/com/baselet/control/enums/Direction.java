package com.baselet.control.enums;

public enum Direction {
	LEFT, RIGHT, UP, DOWN;

	public boolean isHorizontal() {
		return this == LEFT || this == RIGHT;
	}

	public Direction invert() throws MissingInvertMappingException {
		switch (this) {
			case LEFT:
				return RIGHT;
			case RIGHT:
				return LEFT;
			case UP:
				return DOWN;
			case DOWN:
				return UP;
			default:
				throw new MissingInvertMappingException("missing invert mapping", this);
		}
	}

	class MissingInvertMappingException extends Exception{
		MissingInvertMappingException(String message, Direction direction){
			super(message + " missing invert mapping with direction: " + direction);
		}
	}
}
