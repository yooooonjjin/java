package study14;

public interface CarVolService extends VolService {
	
	//VolService에서 불러온 내용
	//public void volUp(int volumn);
	//public void volDown(int volumn);
	
	public void volOff();
	public void volPause();
	public void volResume();
}
