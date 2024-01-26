package _35_Json_JavaScriptObjectNotation;

import java.time.OffsetDateTime;
import java.util.UUID;
/*
 * https://randomuser.me/api/?results=5 
 * 
 * randomuser.me sitesi rastgele verilerden oluşturulmuş kişileri barındırıyor. 
 * Multiple users kısmından biz de yukarıdaki linki kullanarak kullanıcılar oluşturacağız.
 * Sitenin rastgele kullanıcı üretmesi için results kısmının sonuna kullanıcı sayısı giriyoruz.
 * Biz en sona 5 yazdığımız için site rastgele verilere sahip 5 kullanıcı oluşturmuş oldu.
 * Bu kullanıcılara ait bütün bilgileri kod olarak bize çıktı veriyor.
 * Yukarıdaki linki kullanarak maksimum 5000 tane kullanıcı oluşturabiliyoruz.
 * 
 * https://jsonformatter.org/json-to-java
 * 
 * Oluşturduğu kullanıcıların bilgilerini aldık ve üstteki linke jsonformatter.org sitesine yapıştırdık.
 * JSON to Java dedikten sonra site verdiğimiz kullanıcılar için gerekli kodları yazdırıyor.
 * Bu kodlar ihtiyacımız olan sınıfları, değişkenleri, get ve set metotlarını barındırıyor.
 * Bu hazır kodları içinde bulunduğumuz User sınıfı içine yapıştırdık ve kendimize göre düzenledik.
 * Bu şekilde User için gerekli olan kodları tek tek yazmak yerine hazır bir şekilde siteden almış olduk.
 * Kodları yapıştırdığımız zaman bütün sınıflar peş peşe sıralanmış halde geldi.
 * Sınıfların hepsi public tanımlı ve bir sınıfta sadece bir tane public sınıf olması gerekiyor.
 * Bu hatayı gidermek için bütün sınıfları User sınıfı içine alıyoruz ve nested class yapmış oluyoruz.
 * Nested kullanımında üst sınıfımız User sınıfı olmuş oldu ve alt sınıfları içine taşıdık.
 * Alt sınıflarımız da Name, Id, Dob, Login, Picture, Timezone, Location, Coordinates, Street sınıfları oldu.
 * 
 * https://mvnrepository.com/
 * 
 * Json içindeki kullanıcı verilerini okuyup programımızda kullanıcılarla eşleştirmeliyiz.
 * Yani User nesnesi oluşturup set metotlarıyla o kullanıcının bilgilerini tek tek atama yapmalıyız.
 * Binlerce kullanıcı olduğunda her kullanıcı için bunu tek tek yapmak çok uzun zaman alabilir.
 * Onun yerine Json verilerini okuyup bizim programımızda eşleştirme yapabilmesi için hazır kütüphaneler var.
 * Java da kullanabileceğimiz dışarıdaki bütün kütüphanelere maven repository üzerinden erişebiliyoruz.
 * Yukarıda linki olan maven repository üzerinden ihtiyacımız olan kütüphaneyi alıp projemize dahil edebiliyoruz.
 * Bu kütüphanelerden en popüler olanlardan biri olan google kütüphanesi gson kullanacağız.
 * Gson kütüphanesini alıp projemize uygulamamız için şu anki Java projemiz buna uygun değil.
 * Dışarıdan bir kütüphane eklemek için projemizi Convert to Maven diyerek bir Maven projesine dönüştürüyoruz.
 * Projemizi bir maven projesine dönüştürdükten sonra kütüphane eklemek için bir pom.xml oluşuyor.
 * Bu pom.xml projemizin içine bazı kütüphaneleri eklemek için bir alan içeriyor.
 * Buradaki build bloğunun kapanma tag'inden sonra kütüphane eklemek için bir dependencies bloğu açıyoruz.
 * Bu açtığımız dependencies blokları arasına eklemek istediğimiz kütüphanenin maven kodlarını yazmalıyız.
 * Gson kütüphanesine girip istediğimiz versiyonu seçiyoruz ve maven kısmına tıklayıp ordaki kodları kopyalıyoruz.
 * Kopyaladığımız kodları açtığımız dependencies blokları arasına yapıştırıyoruz. 
 * Maven Dependencies içine gson-2.10.jar dosyasını siteye bağlanıp indirdi gson kütüphanesini projemize eklemiş oluyoruz.
 * 
 * Bunun yerine jar dosyasını alıp bir klasöre atıp onunla da çalışabiliriz ama o kütüphanenin de bağlı olduğu başka kütüphaneler olabiliyor.
 * Bu durumda onları takip edip tek tek o kütüphanelerin de jar dosyasını klasöre eklememiz gerekiyor.
 * Tek tek eklediğimizde bile uyum sorunları sürüm farklılıkları olabiliyor.
 * Bunlarla tek tek uğraşmak yerine maven bu durumları yönetiyor ve kontrol edip ilgili kütüphaneleri ve uygun sürümlerini de ekliyor.
 * 
 * 
 * 
 * <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
 *	<dependency>
 *   	<groupId>com.google.code.gson</groupId>
 *   	<artifactId>gson</artifactId>
 *   	<version>2.10.1</version>
 *	</dependency>
 * 
 * 
 */
public class User {

	//Nesne Değişkenleri:
	private String gender;
	private Name name;
	private Location location;
	private String email;
	private Login login;
	private Dob dob;
	private Dob registered;
	private String phone;
	private String cell;
	private ID id;
	private Picture picture;
	private String nat;

	//Getters and Setters:
	public String getGender() {
		return gender;
	}

	public void setGender(String value) {
		this.gender = value;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name value) {
		this.name = value;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location value) {
		this.location = value;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login value) {
		this.login = value;
	}

	public Dob getDob() {
		return dob;
	}

	public void setDob(Dob value) {
		this.dob = value;
	}

	public Dob getRegistered() {
		return registered;
	}

	public void setRegistered(Dob value) {
		this.registered = value;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String value) {
		this.phone = value;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String value) {
		this.cell = value;
	}

	public ID getID() {
		return id;
	}

	public void setID(ID value) {
		this.id = value;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture value) {
		this.picture = value;
	}

	public String getNat() {
		return nat;
	}

	public void setNat(String value) {
		this.nat = value;
	}

	//DOB SINIFI
	public class Dob {
		
		//Nesne Değişkenleri:
		private OffsetDateTime date;
		private long age;

		//Getters and Setters:
		public OffsetDateTime getDate() {
			return date;
		}

		public void setDate(OffsetDateTime value) {
			this.date = value;
		}

		public long getAge() {
			return age;
		}

		public void setAge(long value) {
			this.age = value;
		}
	}

	//ID SINIFI
	public class ID {
		
		//Nesne Değişkenleri:
		private String name;
		private String value;

		//Getters and Setters:
		public String getName() {
			return name;
		}

		public void setName(String value) {
			this.name = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	//LOCATION SINIFI
	public class Location {
		
		//Nesne Değişkenleri:
		private Street street;
		private String city;
		private String state;
		private String country;
		private long postcode;
		private Coordinates coordinates;
		private Timezone timezone;

		//Getters and Setters:
		public Street getStreet() {
			return street;
		}

		public void setStreet(Street value) {
			this.street = value;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String value) {
			this.city = value;
		}

		public String getState() {
			return state;
		}

		public void setState(String value) {
			this.state = value;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String value) {
			this.country = value;
		}

		public long getPostcode() {
			return postcode;
		}

		public void setPostcode(long value) {
			this.postcode = value;
		}

		public Coordinates getCoordinates() {
			return coordinates;
		}

		public void setCoordinates(Coordinates value) {
			this.coordinates = value;
		}

		public Timezone getTimezone() {
			return timezone;
		}

		public void setTimezone(Timezone value) {
			this.timezone = value;
		}
	}

	//COORDINATES SINIFI
	public class Coordinates {
		
		//Nesne Değişkenleri:
		private String latitude;
		private String longitude;

		//Getters and Setters:
		public String getLatitude() {
			return latitude;
		}

		public void setLatitude(String value) {
			this.latitude = value;
		}

		public String getLongitude() {
			return longitude;
		}

		public void setLongitude(String value) {
			this.longitude = value;
		}
	}

	//STREET SINIFI
	public class Street {
		
		//Nesne Değişkenleri:
		private long number;
		private String name;

		//Getters and Setters:
		public long getNumber() {
			return number;
		}

		public void setNumber(long value) {
			this.number = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String value) {
			this.name = value;
		}
	}

	//TIMEZONE SINIFI
	public class Timezone {
		
		//Nesne Değişkenleri:
		private String offset;
		private String description;

		//Getters and Setters:
		public String getOffset() {
			return offset;
		}

		public void setOffset(String value) {
			this.offset = value;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String value) {
			this.description = value;
		}
	}

	//LOGIN SINIFI
	public class Login {
		
		//Nesne Değişkenleri:
		private UUID uuid;
		private String username;
		private String password;
		private String salt;
		private String md5;
		private String sha1;
		private String sha256;

		//Getters and Setters:
		public UUID getUUID() {
			return uuid;
		}

		public void setUUID(UUID value) {
			this.uuid = value;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String value) {
			this.username = value;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String value) {
			this.password = value;
		}

		public String getSalt() {
			return salt;
		}

		public void setSalt(String value) {
			this.salt = value;
		}

		public String getMd5() {
			return md5;
		}

		public void setMd5(String value) {
			this.md5 = value;
		}

		public String getSha1() {
			return sha1;
		}

		public void setSha1(String value) {
			this.sha1 = value;
		}

		public String getSha256() {
			return sha256;
		}

		public void setSha256(String value) {
			this.sha256 = value;
		}
	}

	//NAME SINIFI
	public class Name {
		
		//Nesne Değişkenleri:
		private String title;
		private String first;
		private String last;

		//Getters and Setters:
		public String getTitle() {
			return title;
		}

		public void setTitle(String value) {
			this.title = value;
		}

		public String getFirst() {
			return first;
		}

		public void setFirst(String value) {
			this.first = value;
		}

		public String getLast() {
			return last;
		}

		public void setLast(String value) {
			this.last = value;
		}
	}

	//PICTURE SINIFI
	public class Picture {
		
		//Nesne Değişkenleri:
		private String large;
		private String medium;
		private String thumbnail;

		//Getters and Setters:
		public String getLarge() {
			return large;
		}

		public void setLarge(String value) {
			this.large = value;
		}

		public String getMedium() {
			return medium;
		}

		public void setMedium(String value) {
			this.medium = value;
		}

		public String getThumbnail() {
			return thumbnail;
		}

		public void setThumbnail(String value) {
			this.thumbnail = value;
		}
		
	}
	
}
