package memberinterface;

public class Button2Run {
	public static void main(String[] args) {
		Button2 button2 = new Button2();
		button2.setOnclickLstener(new OnTouchListener() {

			@Override
			public void onTouch(String msg) {
				System.out.println(msg);
			}
		});
		button2.touch();
	}
}
