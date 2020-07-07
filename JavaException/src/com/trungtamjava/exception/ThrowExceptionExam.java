package com.trungtamjava.exception;

public class ThrowExceptionExam {
	public static void main(String[] args) {
		// khi su dung 1 ham co throws exception
		// minh phai try catch exception do.
		// vi co the no xay ra loi exception
		try {
			info("Hello");
		} catch (MyException e) {
			e.printStackTrace();
		}
		try {
			info(null);
		} catch (MyException ex) {
			// ex chinh = my throw ra
			String msg = ex.getMsg();
			System.out.println(msg);
		}
	}

	/// throws: chi la loai doi tuong exception tra ve
	public static void info(String s) throws MyException {
		if (s == null) {
			MyException my = new MyException();
			my.setMsg("Loi null");
			throw my;/// tuong tu return, ap dung cho exception
//			throw new MyException("Loi null");
		}
		System.out.println(s);
	}
}
