package ru.mera.pechenkina.task6_2;

public class Players {
	
	
	public enum Names {
		ABC,
		BCD,
		CDE,
		DEF,
		EFG,
		FGH,
		GHI,
		HIJ,
		IJK,
		JKL;				
	}
	
	public enum PlayerState {
		HIDE,
		NOTHIDE,
		WENTHOME
	}
	
	private String Names;
	private String PlayerState;
	/**
	 * @param names
	 * @param playerState
	 */
	public Players(String names, String playerState) {
		Names = names;
		PlayerState = playerState;
	}
	public String getNames() {
		return Names;
	}
	public String getPlayerState() {
		return PlayerState;
	}
	
	@Override
    public String toString() {
        return String.format("Player with name: %s now he is %s", getNames(), getPlayerState());
    }

}


