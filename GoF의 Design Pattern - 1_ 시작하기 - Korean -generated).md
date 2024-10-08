[음악]

아

안녕하세요

저와 함께 디자인 패턴에 대해서

살펴보겠습니다

청 숨을 세계의 디자인 패턴을 살펴볼 건데요

먼저 이 숨을 3개의 패턴들을

살펴보기에 앞서 디자인 패턴이

무엇인지 왜 필요한지에 대해서

살펴보겠습니다

먼저 소프트웨어의 개발은

요구사항 분석 설계 예

구현 테스트 와 같은 과정을 반복하게

되는 데요

인해 가지 좀 설계를 올바르고

효과적으로 하기 위해서 디자인 패턴을

적용하는 것이 매우 좋습니다

디자인 패턴이란

소프트웨어 설계 방법이구요

반복되는 패턴 처럼 자주 나타나는

클래스 들간의 관계를 잘 맺는 방법

입니다

이 관계를 맺는다는 것이 바로

설계라고 할 수 있습니다

이 그림은 클래스 간의 관계를 나타낸

클래스 다이어그램으로

앞으로 이 강좌에서 자주 보게 될

것입니다

그럼 왜 클래스들이 관계를 맺어야

하는가 왜 올바르게 관계를 맺어야

하는지 그 이유를 살펴 보면요

먼저 1번과 2번은 배경이 되는

내용인데요

클래스 는 최소한의 단위 기능을

가져야 합니다

즉 하나의 클래스 는 많은 기능을

갖기 보다는

만 하나의 기능을 갖는 것이 가장

이상적입니다

큰 기능은 이러한 단위 기능을 가진

클래스 들간의 상호 0개 즉 관계를

통해서 개발되고 동작합니다

이러한 배경으로 만들어진 소프트웨어는

3 4 5번 외에 내용처럼 꼭 필요한

것들만 으로 구성되어 최적화된

소프트웨어 로 개발 되구요

또 문제가 발생했을 때 최소한의 코드

성으로 유지보수가 용이합니다

또 새로운 기능을 추가해야 할 때

지존 기능에 영향을 주지 않고 새로운

기능 추가가 용이합니다

그럼 디자인 패턴을 배운다는 것은

무엇을 배우는 것일까요

바로 고프 의 디자인 패턴입니다

고프 의 디자인 패턴 이 무엇인지

살펴 보면요

전세계의 개발자들이 추천하는 가장

유용하고 가장 대표적인 디자인

패턴입니다

정확한 연도는 모르겠으나

1990년대 중 4명의 뛰어난 개발자

갱 어브 포 라 불리는 이 개발자들이

체계적으로 정리해 놓은 설계 방법

인데요 수십 년이 지난 지금까지도

매우 유용한 설계 방법이구요

이익 트 스프링 프레임워크 또는

라이브러리 등의 설계 에서도 이

디자인 패턴들을 쉽게 발견할 수

있습니다

오포 의 디자인 패턴은 총 23 개의

패턴으로 구성되어 있구요

앞으로 이 23개 패턴들을 하나씩

살펴보겠습니다

2 23 개의 패턴은 생성 국조

행위라는 3가지로 분리됩니다

사실 이러한 분류는 별로 중요하지

않고요

디자인 패턴은 매울 필요가 없습니다

또 설계의 반드시 그대로 적용해야

하는 것도 아닙니다 그냥 이해하는

것이 중요합니다

디자인 패턴은 클래스 들간의 최적의

관계를 매우 효과적으로 설계할 수

있는 하나의 사례로 받아들이고

이해하면 됩니다

디자인 패턴을 배경지식 으로서

인지하고

각각의 디자인 패턴을

여러 가지 관점에서 변형하고 서로

혼합하여 소프트웨어 설계 에서

활용하면 됩니다

이 강좌에 세습은 객체지향

프로그래밍이 가능한 언어 중에서

아바 를 사용합니다

자바에 매우 기본적인 op 기능만 의

사용하므로 5p 를 지원하는 다른

언어에서도 디자인 패턴을 적용할 수

있습니다

자바 코드를 입력하는 개발 툴은

이클립스 나

비주얼 스튜디오 6 코드를 사용할 수

있는데요 저는 비주얼스튜디오 코드를

생각했습니다

실습 환경에 대한 구상은 따로 설명

드리지 않으니 이 강좌를 학습 하시는

분들은 스스로 환경을 구성 하시기

바랍니다

자바와 코드를 입력할 수 있는 이 크

리 스 나

비주얼스튜디오 코드만을 설치하시면

됩니다

이제 다음 강좌에서 부터 23 개의

디자인 패턴을 하나씩 살펴보도록

하겠습니다

