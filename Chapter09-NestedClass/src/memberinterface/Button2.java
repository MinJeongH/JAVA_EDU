package memberinterface;

public class Button2 {

	OnTouchListener listener;

	void setOnclickLstener(OnTouchListener listener) {
		this.listener = listener;
	}

	void touch() {
		if (this.listener != null) {
			this.listener.onTouch("화면에 터치 되었습니다.");
		}
	}
}
