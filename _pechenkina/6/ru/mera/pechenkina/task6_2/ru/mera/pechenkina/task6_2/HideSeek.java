package ru.mera.pechenkina.task6_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import ru.mera.pechenkina.task6_2.Players.Names;
import ru.mera.pechenkina.task6_2.Players.PlayerState;

public class HideSeek {

	public static Map<Integer, Players> players = new HashMap<Integer, Players>();
	public static ArrayList<Players> winners = new ArrayList<Players>();
	public static ArrayList<Players> loosers = new ArrayList<Players>();

	public static class MiJeDogovarivalisDomaNePryatatsaException extends Exception {

		public MiJeDogovarivalisDomaNePryatatsaException(String message) {
			super(message);
		}
	}

	public static void main(String[] args) throws MiJeDogovarivalisDomaNePryatatsaException {
		// TODO Auto-generated method stub

		// ArrayList<Players> = new ArrayList<Players>(10);

		PlayerState[] plrstate = PlayerState.values();

		Random random = new Random(System.currentTimeMillis());
		int randomstate = random.nextInt(3);
		int randomstate1 = random.nextInt(3);
		int randomstate2 = random.nextInt(3);
		int randomstate3 = random.nextInt(3);
		int randomstate4 = random.nextInt(3);
		int randomstate5 = random.nextInt(3);
		int randomstate6 = random.nextInt(3);
		int randomstate7 = random.nextInt(3);
		int randomstate8 = random.nextInt(3);
		int randomstate9 = random.nextInt(3);

		Players pl1 = new Players(Names.ABC.toString(), plrstate[randomstate].toString());
		Players pl2 = new Players(Names.BCD.toString(), plrstate[randomstate1].toString());
		Players pl3 = new Players(Names.CDE.toString(), plrstate[randomstate2].toString());
		Players pl4 = new Players(Names.DEF.toString(), plrstate[randomstate3].toString());
		Players pl5 = new Players(Names.EFG.toString(), plrstate[randomstate4].toString());
		Players pl6 = new Players(Names.FGH.toString(), plrstate[randomstate5].toString());
		Players pl7 = new Players(Names.GHI.toString(), plrstate[randomstate6].toString());
		Players pl8 = new Players(Names.HIJ.toString(), plrstate[randomstate7].toString());
		Players pl9 = new Players(Names.IJK.toString(), plrstate[randomstate8].toString());
		Players pl10 = new Players(Names.JKL.toString(), plrstate[randomstate9].toString());

		players.put(0, pl1);
		players.put(1, pl2);
		players.put(2, pl3);
		players.put(3, pl4);
		players.put(4, pl5);
		players.put(5, pl6);
		players.put(6, pl7);
		players.put(7, pl8);
		players.put(8, pl9);
		players.put(9, pl10);

		// print all players in team
		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i));
		}

		// play and leader said
		boolean endOfGame = false;
		try {
			for (int i = 0; i < players.size(); i++) {
				
				boolean leadersay = random.nextBoolean();
				
				if (leadersay) {

					System.out.println("Leader silently check player on step " + i);
					if (players.get(i).getPlayerState().toString() == PlayerState.HIDE.toString()) {
						winners.add(players.get(i));
						System.out.println("Our winner  " + winners.size());
					} else if (players.get(i).getPlayerState().toString() == PlayerState.NOTHIDE.toString()) {
						loosers.add(players.get(i));
						System.out.println("Our loosers  " + loosers.size());
					} else {
						endOfGame = true;
						throw new MiJeDogovarivalisDomaNePryatatsaException(
								"It is not honest to go home Mr. " + players.get(i).getNames());
					}

				} else {
					System.out.println("Leader said  NOT HIDE on step " + i);
					if (players.get(i).getPlayerState().toString() == PlayerState.NOTHIDE.toString()) {
						loosers.add(players.get(i));
						System.out.println("Our loosers  " + loosers.size());
					} else {
						continue;
					}
				}

			}

		} catch (MiJeDogovarivalisDomaNePryatatsaException e) {
			//System.err.print(e);
			System.out.println(e);
		}

		if (!endOfGame) {
			// print all winners in team
			System.out.println("we have " + winners.size() + " winners ");
			for (int i = 0; i < winners.size(); i++) {
				System.out.println("Our winner  " + winners.get(i));
			}

			System.out.println("we have " + loosers.size() + " loosers ");
			// print all loosers in team
			for (int i = 0; i < loosers.size(); i++) {
				System.out.println("Our loosers  " + loosers.get(i));
			}

		}

	}

}
