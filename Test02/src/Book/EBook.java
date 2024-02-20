package Book;

import java.util.Arrays;

//EBook클래스는 Book클래스를 상속한 클래스
//Book클래스의 모든 멤버(필드 및 메서드)를 상속 받음
public class EBook extends Book{

		// 새로운 필드 추가 , 디바이스 목록을 저장하는 배열로 초기화
	    private String[] supperDevices = {"안드로이드", "아이폰", "태블릿"};
	    
	    //선택된 기기를 저장할 변수
	    private String selectedDevice;

	    //book의 생성자를 호출한다.
	    public EBook(String title, String author, int price, String publisher) {
	        super(title, author, price, publisher);
	    }

	    //supperDevices필드의 값을 반환하는 getter메서드
	    public String[] getSupperDevices() {
	        return supperDevices;
	    }
	    
	    // 선택된 기기 설정
	    public void setSelectedDevice(String selectedDevice) {
	    	this.selectedDevice = selectedDevice;
	    }
	    
	    //선택된 기기 반환
	    public String getSelectedDevice() {
	    	return selectedDevice;
	    }

	    //supperDevices필드의 값을 설정하는 setter메서드
	    public void setSupperDevices(String[] supperDevices) {
	        this.supperDevices = supperDevices;
	    }

	    //배열을 문자열로 변환하는 메서드 오버라이딩
	    @Override
	    public String toString() {
	        return super.toString() + "| 호환 기기: " + selectedDevice;
	    }

	}

