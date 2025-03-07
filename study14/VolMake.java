package study14;

//캡슐화(public), 상속(implements), 다형성(오버레이딩), 추상화(interface) 
public class VolMake implements VolService {
	//인스턴스변수
	private int volumn;	//기본 값이 0이 자동 세팅됨

	public VolMake() {
		volumn = 1;
	}
	
	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	@Override
	public void volUp(int volumn) {
		this.volumn += volumn;
	}

	@Override
	public void volDown(int volumn) {
		this.volumn -= volumn;
	}
	
}
