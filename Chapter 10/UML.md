Book
-------------------------------------
- title: String
- author: String
- pages: int
- currentPage: int
-------------------------------------
+ Book(title: String, author: String, pages)
+ getAuthor(): String
+ setAuthor(author: String): void
+ getPages(): int
+ setPages(pages: int): void
+ displayInfo(includePages: boolean): void
+ getCurrentPage(): int
+ nextPage(): void

BankAccount
-------------------------------------
- bank: String
- accountHolder: String
- balance: double
-------------------------------------
+ BankAccount(bank: String, accountHolder: String, balance: double)
+ getBalance(): double
+ depositAmount(double: amount): void
+ withdrawAmount(double: amount): void
+ getBank(): String
+ changeBank(bank: String): void
+ takeOutLoan(double: amount): void

Movie
-------------------------------------
- title: String
- rating: double
- playCount: int
- director: String
-------------------------------------
+ Movie(title: String, rating: int, playCount: String)
+ getTitle(): String
+ setTitle(title: String): void
+ getDirector(): String
+ setDirector(director: String): void
+ watchMovie(): void
+ addRating(rating: int): void

Rectangle
-------------------------------------
- width: double
- height: double
- area: double
- perimeter: double
-------------------------------------
+ Rectangle(width: double, height: double)
+ getWidth(): double
+ setWidth(width: double): void
+ getHeight(): double
+ setHeight(width: double): void
+ getDimensionsRatio(): double
+ inscribeSquare(): Square