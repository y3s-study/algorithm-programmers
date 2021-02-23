# Java 알고리즘 스터디 시즌2 (with programmers)

java 언어로 알고리즘 문제를 풀고 서로의 코드를 공유합니다.

## 프로젝트 설정 및 실행

### 사전 준비 사항
1. git을 설치합니다.
2. JDK를 설치합니다. (jdk 1.8 이상)
3. `git clone https://github.com/y3s-study/algorithm-programmers.git` 명령으로 프로젝트를 내려받습니다.

### Eclipse 프로젝트 설정
1. Eclipse 실행 후 `Buildship Gradle Integration 2.0` 플러그인을 설치합니다.
2. `File` > `import` > `Gradle` > `Existing Gradle Project`를 선택하여 내려받은 프로젝트를 import 합니다.


## 패키지 생성 가이드
1. `src/main/java` 패키지 밑에 알고리즘 사이트별 패키지를 작성합니다.
    - ex) Baekjoon Online Judge : `src/main/java/programmers`
2. 각 사이트별 패키지 밑에 `/{본인 이름}/{단계별 제목}/{p_문제번호}` 형식으로 문제별 패키지를 생성합니다.
    - ex) `src/main/java/programmers/sk/p_0001`

## 커밋 메시지 가이드
1. 커밋 메시지는 검색의 편의를 위해 알고리즘 사이트명과 문제 번호(ID)가 포함되도록 작성합니다.
    - ex) `[programmers] 0001 문제 풀이 작성`
