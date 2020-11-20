package lotto;

import java.util.Arrays;

public class LottoDto {
	private int countLimit, lottoCount;
	private int[] lotto;
	private int[][] lottos;
	public int getCountLimit() {
		return countLimit;
	}
	public void setCountLimit(int countLimit) {
		this.countLimit = countLimit;
	}
	public int getLottoCount() {
		return lottoCount;
	}
	public void setLottoCount(int lottoCount) {
		this.lottoCount = lottoCount;
	}
	public int[] getLotto() {
		return lotto;
	}
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	public int[][] getLottos() {
		return lottos;
	}
	public void setLottos(int[][] lottos) {
		this.lottos = lottos;
	}
	@Override
	public String toString() {
		return "LottoDto [countLimit=" + countLimit + ", lottoCount=" + lottoCount + ", lotto=" + Arrays.toString(lotto)
				+ ", lottos=" + Arrays.toString(lottos) + "]";
	}
	

}
