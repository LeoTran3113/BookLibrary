package Package1;

public class BookShopMain {
	public static void main(String[] args) {

		Customer customerDung = new Customer();

		customerDung.id = "001";
		customerDung.name = "Thay Dung";
		customerDung.email = "thaydung@gmail.com";

		Customer customerKiet = new Customer();

		customerKiet.id = "002";
		customerKiet.name = "Anh Kiet";
		customerKiet.email = "anhKiet@gmail.com";

		Customer[] customers = { customerDung, customerKiet };

		Book book1 = new Book();

		book1.id = "01";
		book1.name = "Lay tinh tham ma doi dau bac";
		book1.author = "Van Tinh";
		book1.ISBN = "978-604-77-7670-2";

		Book book2 = new Book();

		book2.id = "02";
		book2.name = "Tuoi tre dang gia bao nhieu";
		book2.author = "Nguyen Hoang Nguyen";
		book2.ISBN = "978-604-306-114-7";

		Book book3 = new Book();

		book3.id = "03";
		book3.name = "Nha Gia Kim";
		book3.author = "Pail Coelho";
		book3.ISBN = "978-604-347-847-1";

		Book book4 = new Book();

		book4.id = "04";
		book4.name = "Cho Toi Xin Mot Ve Di Tuoi Tho";
		book4.author = "Nguyen Nhat Anh";
		book4.ISBN = "978-604-1-14094-3";

		Book book5 = new Book();

		book5.id = "05";
		book5.name = "Toi Thay Hoa Vang Tren Co Xanh";
		book5.author = "Nguyen Nhat Anh";
		book5.ISBN = "978-604-1-14095-0";

		Book[] books = { book1, book2, book3, book4, book5 };

		Genre genreLove = new Genre();

		genreLove.id = "1";
		genreLove.name = "Love";

		Genre genreScifi = new Genre();

		genreScifi.id = "2";
		genreScifi.name = "Sci-Fi";

		Genre genreSelfHelp = new Genre();

		genreSelfHelp.id = "3";
		genreSelfHelp.name = "Self Help";

		Genre[] genres = { genreLove, genreScifi, genreSelfHelp };

		BookDetail bookDetail01 = new BookDetail();

		bookDetail01.id = "0001";
		bookDetail01.book = book1;
		bookDetail01.genre = genreLove;

		BookDetail bookDetail02 = new BookDetail();

		bookDetail02.id = "0002";
		bookDetail02.book = book2;
		bookDetail02.genre = genreSelfHelp;

		BookDetail bookDetail03 = new BookDetail();

		bookDetail03.id = "0003";
		bookDetail03.book = book3;
		bookDetail03.genre = genreScifi;

		BookDetail bookDetail04 = new BookDetail();

		bookDetail04.id = "0004";
		bookDetail04.book = book4;
		bookDetail04.genre = genreLove;

		BookDetail bookDetail05 = new BookDetail();

		bookDetail05.id = "0005";
		bookDetail05.book = book5;
		bookDetail05.genre = genreLove;

		BookDetail[] bookDetails = { bookDetail01, bookDetail02, bookDetail03, bookDetail04, bookDetail05 };

		BorrowDetail borrowDetailBook1 = new BorrowDetail();

		borrowDetailBook1.id = "1";
		borrowDetailBook1.customer = customerDung;
		borrowDetailBook1.book = book1;
		borrowDetailBook1.dateBorrowed = "10/02/2022";
		borrowDetailBook1.dateReturned = "24/04/2022";
		borrowDetailBook1.isReturned = true;

		BorrowDetail borrowDetailBook2 = new BorrowDetail();

		borrowDetailBook2.id = "2";
		borrowDetailBook2.customer = customerDung;
		borrowDetailBook2.book = book2;
		borrowDetailBook2.dateBorrowed = "10/02/2022";
		borrowDetailBook2.dateReturned = "22/04/2022";
		borrowDetailBook2.isReturned = true;

		BorrowDetail borrowDetailBook3 = new BorrowDetail();

		borrowDetailBook3.id = "3";
		borrowDetailBook3.customer = customerDung;
		borrowDetailBook3.book = book3;
		borrowDetailBook3.dateBorrowed = "10/02/2022";
		borrowDetailBook3.isReturned = false;

		BorrowDetail borrowDetailBook4 = new BorrowDetail();

		borrowDetailBook4.id = "4";
		borrowDetailBook4.customer = customerKiet;
		borrowDetailBook4.book = book4;
		borrowDetailBook4.dateBorrowed = "7/3/2022";
		borrowDetailBook4.dateReturned = "24/04/2022";
		borrowDetailBook4.isReturned = true;

		BorrowDetail borrowDetailBook5 = new BorrowDetail();

		borrowDetailBook5.id = "5";
		borrowDetailBook5.customer = customerDung;
		borrowDetailBook5.book = book5;
		borrowDetailBook5.dateBorrowed = "1/3/2022";
		borrowDetailBook5.isReturned = false;

		BorrowDetail borrowDetailBook6 = new BorrowDetail();

		borrowDetailBook6.id = "6";
		borrowDetailBook6.customer = customerKiet;
		borrowDetailBook6.book = book2;
		borrowDetailBook6.dateBorrowed = "1/3/2021";
		borrowDetailBook6.dateReturned = "24/04/2022";
		borrowDetailBook6.isReturned = true;

		BorrowDetail borrowDetailBook7 = new BorrowDetail();

		borrowDetailBook7.id = "7";
		borrowDetailBook7.customer = customerKiet;
		borrowDetailBook7.book = book1;
		borrowDetailBook7.dateBorrowed = "7/3/2022";
		borrowDetailBook7.isReturned = false;

		BorrowDetail borrowDetailBook8 = new BorrowDetail();

		borrowDetailBook8.id = "8";
		borrowDetailBook8.customer = customerDung;
		borrowDetailBook8.book = book4;
		borrowDetailBook8.dateBorrowed = "7/3/2022";
		borrowDetailBook8.isReturned = false;

		BorrowDetail[] borrowDetails = { borrowDetailBook1, borrowDetailBook2, borrowDetailBook3, borrowDetailBook4,
				borrowDetailBook5, borrowDetailBook6, borrowDetailBook7, borrowDetailBook8 };

		Location location1 = new Location();

		location1.id = "1";
		location1.name = "Nguyen Van Cu";
		location1.address = "Quan 5";

		Location location2 = new Location();

		location2.id = "2";
		location2.name = "Tran Hung Dao";
		location2.address = "Quan 1";

		Location location3 = new Location();

		location3.id = "3";
		location3.name = "Bach Dang";
		location3.address = "Quan 3";

		Location[] locations = { location1, location2, location3 };

		StockLocation stockBook1NVC = new StockLocation();

		stockBook1NVC.id = "1";
		stockBook1NVC.book = book1;
		stockBook1NVC.location = location1;
		stockBook1NVC.stock = 3000;

		StockLocation stockBook2NVC = new StockLocation();

		stockBook2NVC.id = "2";
		stockBook2NVC.book = book2;
		stockBook2NVC.location = location1;
		stockBook2NVC.stock = 1500;

		StockLocation stockBook3THD = new StockLocation();

		stockBook3THD.id = "3";
		stockBook3THD.book = book3;
		stockBook3THD.location = location2;
		stockBook3THD.stock = 5000;

		StockLocation stocBook4THD = new StockLocation();

		stocBook4THD.id = "4";
		stocBook4THD.book = book4;
		stocBook4THD.location = location2;
		stocBook4THD.stock = 1000;

		StockLocation stockBook5BD = new StockLocation();

		stockBook5BD.id = "5";
		stockBook5BD.book = book5;
		stockBook5BD.location = location3;
		stockBook5BD.stock = 700;

		StockLocation[] stockLocations = { stockBook1NVC, stockBook2NVC, stockBook3THD, stocBook4THD, stockBook5BD };

		getAllBorrowList(borrowDetails);

		getAllCustomerBorrowList(customers, borrowDetails);
		getStatusReturnOfBook(books, borrowDetails);
	}

	public static void getAllBorrowList(BorrowDetail[] borrowDetails) {
		System.out.println("All borrow detail shown as below:");
		System.out.println("");
		for (BorrowDetail borrowDetail : borrowDetails) {
			if (borrowDetail.isReturned == true) {
				System.out.println("Book: " + borrowDetail.book.name + "  ***  " + "Customer: "
						+ borrowDetail.customer.name + "  ***  " + "Borrow date: " + borrowDetail.dateBorrowed
						+ "  ***  " + "Return date: " + borrowDetail.dateReturned);
				System.out.println("");
			} else {
				System.out.println("Book: " + borrowDetail.book.name + "  ***  " + "Customer: "
						+ borrowDetail.customer.name + "  ***  " + "Borrow date: " + borrowDetail.dateBorrowed
						+ "  ***  " + "Has not returned yet");
			}
			System.out.println("");
		}

	}

	public static void getAllCustomerBorrowList(Customer[] customers, BorrowDetail[] borrowDetails) {
		for (Customer customer : customers) {
			System.out.println("Customer: " + customer.name + " borrow: ");
			System.out.println("");

			for (BorrowDetail borrowDetail : borrowDetails) {
				if (borrowDetail.customer == customer && borrowDetail.isReturned == true) {
					System.out.println("Book: " + borrowDetail.book.name + " *** " + "Date borrow: "
							+ borrowDetail.dateBorrowed + " *** " + "Date return: " + borrowDetail.dateReturned);
				} else if (borrowDetail.customer == customer && borrowDetail.isReturned == false) {
					System.out.println("Book: " + borrowDetail.book.name + " *** " + "Date borrow: "
							+ borrowDetail.dateBorrowed + " *** " + "Has not returned yet");
					System.out.println("");

				}

			}
			System.out.println("**************************************");
		}

	}

	public static void getStatusReturnOfBook(Book[] books, BorrowDetail[] borrowDetails) {
		for (Book book : books) {
			System.out.println("Status Return of Book: " + book.name);
			for (BorrowDetail borrowDetail : borrowDetails) {
				if (borrowDetail.book == book && borrowDetail.isReturned == true) {
					System.out.println("Customer: " + borrowDetail.customer.name + " *** " + "Date borrow: "
							+ borrowDetail.dateBorrowed + " *** " + "Date return: " + borrowDetail.dateReturned);
				} else if (borrowDetail.book == book && borrowDetail.isReturned == false) {
					System.out.println("Customer: " + borrowDetail.customer.name + " *** " + "Date borrow: "
							+ borrowDetail.dateBorrowed + " *** " + "Has not returned yet");
					
				}
				
			}
			System.out.println("");
			System.out.println("********************************************");
		}

	}
}
