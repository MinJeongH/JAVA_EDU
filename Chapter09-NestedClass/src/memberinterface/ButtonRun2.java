package memberinterface;

public class ButtonRun2 {

	public static void main(String[] args) {
		Button b1 = new Button();
		b1.setOnclickLstener(new ButtonClickListener());
		b1.touch();

		Button b2 = new Button();
		b2.setOnclickLstener(new Button.OnClickLsitener() {

			@Override
			public void onClick() {
				System.out.println("Wellcome!");
			}
		});
		b2.touch();
	}

}
