업캐스팅 (자동): Role role = new Lion(...); (사자를 역할 타입에 담음)

다운캐스팅 (강제): Lion lion = (Lion) role; (역할 타입이었던 사자를 다시 사자 타입으로 변환)

자식 클래스에서만 정의된 고유한 데이터나 메서드를 사용하려면 다운 캐스팅 필요.

if (role instanceof Lion){
Lion lion = (Lion) role;
} 

위 코드처럼 instanceof 연산자로 객체가 특정 클래스의 인스턴스인지, 
아님 그 클래스를 상속받는 자식 클래스의 인스턴스인지 확인하여 사용.

맞으면 true 틀리면 false를 반환.

add()는 List나 Set 같은 컬렉션에 단일 요소를 순서대로 추가할 때 사용.

put()은 Map에 키-값(key-value) 쌍으로 데이터를 저장할 때 사용

파트별 조회를 할 때 role.getPart().equals(part)를 통해 원하는 파트인지 한 번 걸러주지 않으면
다른 파트의 객체들의 정보까지 같이 딸려온다.



