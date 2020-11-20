package main;

import java.util.Scanner;

import lotto.LottoDto;

public class LottoMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LottoDto instance = new LottoDto();
		System.out.println("구매한도 설정");
		instance.setCountLimit(scanner.nextInt());
		System.out.printf("설정된 구매한도 %d장\n", instance.getCountLimit());
		while (true) {
			System.out.println("0. 종료 1. 로또 구입");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("로또구입\n");
				buyLottos(instance, scanner);
				break;
			}
		}
	}

	private static void buyLottos(LottoDto instance, Scanner scanner) {
		System.out.println("얼마치를 구입합니까? ");
		System.out.printf("로또 %d장을 발급합니다.\n");
		int[][] lottos = instance.getLottos();
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.println(lottos[i][j] + "\t");
			}
		}
		System.out.println();
	}
}
