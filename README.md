# Product Management 서버

아래 설명은 리눅스 환경 기준으로 서술되었습니다.

## 1. 환경 설정 방법
1. 우선 sdkman을 설치해주세요
```
$ curl -s "https://get.sdkman.io" | bash
```

2. 그리고 터미널에서 프로젝트 루트 디렉토리로 이동해주세요

3. 아래 명령어를 통해 java, kotlin, gradle의 버전을 설치합니다.
```
$ sdk env install
```

4. 다음 명령어를 통해 설치된 버전을 적용해줍니다.
```
$ sdk env
```

환경설정 끝!

---
## 2. 빌드
프로젝트 루트 디렉토리에서 다음 명령어를 통해 빌드합니다.
```
$ ./gradlew build
```

---
## 3. 실행
프로젝으 루트 디렉토리에서 아래 명령어를 통해 실행 가능합니다.
```
$ ./gradlew bootRun
```

---
## 4. 구현 범위

**주어진 과제중 구현 1번까지 완성되었습니다.**


front 페이지가 구현되어 있어 웹으로 접근하여 동작 테스트 가능합니다.
http://localhost:8080

---
## 5. 프로젝트 구조
db/backend/frontend 구조는 아래와 같습니다.

`in-memory h2 db -- web server -- template engin`

기본적으로 3 layer architecture로 구성하였고 하나의 도메인에 종속된 구조입니다.

---

---

## 6. 셀프 피드백
주어진 과제를 진행하며 스스로 어떤 점이 부족한지 많이 느낄 수 있었습니다.

기본 구현사항의 간단한 점부터 먼저 구현했다면 어땠을까 하는 아쉬움이 남습니다.

해당 과제를 통해 처음으로 kotlin을 다뤄보았는데 이 경험을 통해 앞으로 더 발전할 수 있도록 노력하겠습니다.

감사합니다.