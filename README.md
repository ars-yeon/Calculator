# NB Camp - project - Calculator
내일배움캠프 - Kotlin 문법 기초 과제 - 계산기


# 💻 Goal
나만의 계산기 만들기
- 지금까지 배운 Kotlin문법을 응용해서 나만의 계산기를 만들기
- Lv1 ~ Lv3 기본 구현, Lv4 추가 구현


# ⚙️ Feature
## Lv1
더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들고, 클래스를 이용하여 연산을 진행하고 출력하기


## Lv2
Lv1에서 만든 Calculator 클래스에 나머지 연산(%)을 가능하도록 코드를 추가하고, 연산 진행 후 출력하기


## Lv3
AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를을 만든 후 클래스간의 관계를 고려하여 Calculator 클래스와 관계를 맺기
- 관계를 맺은 후 필요하다면 Calculator 클래스의 내부코드를 변경하기
  + 나머지 연산자(%) 기능은 제외
- Lv2 와 비교하여 어떠한 점이 개선 되었는지 스스로 생각하기
  + hint. 클래스의 책임(단일책임원칙)


## Lv4 (선택)
AddOperation(더하기), SubtractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스들을 AbstractOperation라는 클래스명으로 만들어 사용하여 추상화하고 Calculator 클래스의 내부 코드를 변경하기
- Lv3 와 비교해서 어떠한 점이 개선 되었는지 스스로 생각해 봅니다.
  + hint. 클래스간의 결합도, 의존성(의존성역전원칙)
