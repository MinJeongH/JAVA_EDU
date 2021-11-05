package memberinterface;

public class ButtonClickListener implements Button.OnClickLsitener {

	@Override
	public void onClick() {
		System.out.println("버튼이 클릭되었습니다.");
	}
}
