# P1MacroBoard
## 자동 마우스 이동 및 클릭 프로그램
```shell
* [v] Spring 3.0.6
* [v] Flask 2.3.2
* [v] JDK 17 / python 3.10.4
* [v] React 5.0.1
* [v] DB : h2
```

## 기능 및 사용방법
- 자주 사용하는 좌표 저장 및 불러오기 기능 추가(06.12)
- 마우스 위치 추적 시작 누르면 마우스가 위치한 곳의 화면상 좌표가 출력됨
- 화면을 클릭하면 해당 위치의 좌표가 [마우스 클릭 좌표] 에 누적하여 저장됨
- 저장된 좌표를 보고 [마우스 좌표 및 대기시간 입력] 에 작성하고 '반복시작' 누르면 실행됨
- 초기화 버튼 클릭 시 저장된 좌표 위치 reset

## Todo
- 중지, 배경음악 재생 등 기능 추가
- 마우스 좌표(현재 최대 6개) 개수 자율적으로 늘릴 수 있도록 하는 기능 추가

## 개발 노트
- 개발내용 확인 : https://khc-developer.tistory.com/24
