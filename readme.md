## Spring Boot 수강일지
***
### 2022-03-20
##### [2-1] RESTful Web Service의 이해
##### REST (Representational State Transfer)
- 웹 서비스 JAX-WS(Java Api for Web Services) 기술은 호출 당사자 사이에 엄격한 계약이 있을경우 적절한 선택이 될 수 있음.
- 개방형 서비스를 위한 API를 제공하려면 HTTP기술 기반인 JAX-RS(Java Api for Restful Services를 사용해야함.
- 관공서 등에서는 웹서비스를,  인터넷 제공 업체에서는 RESTful 서비스를 주로 사용한다.
- REST는 HTTP와 JSON으로 주로 통신

- REST는 총 [자원], [행위], [표현]으로 구성된다.
- (원칙 1)[자원] : 모든 리소스는 URI로 식별한다. : 서버와 클라이언트로 봤을때. 클라이언트에서 요청하는 자원들이 다양하게 존재할껀데, 각각의 리소스를 구분하는 방법이 바로 URI를 통한 식별이 되어야 한다.
- URL과 URI를 혼동할 수 있는데 URI가 더 큰 개념임
    - URI : 어느위치에 어떤 자료까지 포함하는 데이터
    - URL: 어느 위치 자체를 말함.


- (원칙 2)다중[표현] : 각 자원들은 JSON 혹은 XML과 같이 어떠한 형태로든 표현할 수 있어야 한다.
- (원칙 3)[행위] : 모든 리소스는 표준 HTTP 메서드로 접근/변경/생성/삭제 할 수 있어야 한다.
- (원칙 4) : 서버는 상태정보를 갖지 않는다. 클라이언트의 세션정보와 같은것을 서버에서 관리하지 않는 형태
***

### 2022-03-21
##### [2-2] RESTful API Naming
- 실용적인 RESTful 디자인의 첫번째 원칙은 간결하고 직관적인 기준 URL을 유지하는 것임.
- 기준 URL 설계는 API에서 가장 중요한 설계 행동유도겅(affordance) 임.
- 행동유도성은 가이드 문서가 필요없는 설계재산임.( 직관적 설계 )

##### 명사와 동사
- 자원별로 두개의 기준 url을 사용함. 
- 기준 url에는 동사를 두지 않음.
- 컬렉션이나 요소들을 다룰때는 HTTP 메소드를 사용함.
- 목록을 위한 URL : /articles
- 목록 중 특정 개체를 위한 URL : /articles/1234

- HTTP 메서드에 따른 기능 분류
- POST : CREATE
- GET : READ
- PUT : UPDATE
- DELETE : DELETR