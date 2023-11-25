package main.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PostCategorie {

	HIGHEST(0),
	MAIN(1),
	LEADING(2),
	SENIOR(3),
	JUNIOR(4);

	private int post;
}
