**Factory Method Pattern**

- 객체 생성을 위한 패턴

- 객체 생성에 필요한 과정을 템플릿처럼 정해 놓고 각과정을다양하게 구현이 가능함

- 구체적으로 생성할 클래스를 유연하게 정할 수 있음

- 객체 생성에 대한 인터페이스와 구현의 분리



각 라인을 해석해 보겠습니다:

package FactoryMethod;: 현재 클래스가 속한 패키지를 정의하는 선언입니다. 이 클래스는 "FactoryMethod" 패키지에 속합니다.

import java.util.HashMap;: java.util 패키지에서 HashMap 클래스를 사용할 것임을 선언합니다. HashMap은 키-값 쌍을 저장하는 자료구조입니다.

public class ItemFactory extends Factory{: ItemFactory 클래스를 정의하고, Factory 클래스를 확장(상속)합니다. 즉, ItemFactory 클래스는 Factory 클래스를 확장하여 Factory 클래스의 특성을 상속받습니다.

private class ItemData {: 내부 클래스인 ItemData를 정의합니다. 이 클래스는 각 아이템의 최대 개수와 현재 개수를 저장합니다.

int maxCount;: 아이템의 최대 개수를 저장하는 멤버 변수입니다.

int currentCount;: 아이템의 현재 개수를 저장하는 멤버 변수입니다.

ItemData(int maxCount) {: ItemData 클래스의 생성자를 정의합니다. 최대 개수를 받아서 초기화합니다.

this.maxCount = maxCount;: 최대 개수를 초기화합니다.

private HashMap<String, ItemData> repository;: ItemFactory 클래스 내부에 HashMap 타입의 repository 변수를 선언합니다. 이 변수는 아이템 이름과 해당 ItemData를 매핑하는데 사용됩니다.

public ItemFactory() {: ItemFactory 클래스의 생성자를 정의합니다.

repository = new HashMap<String, ItemData>();: repository 변수를 HashMap 객체로 초기화합니다.

repository.put("sword", new ItemData(3));: repository에 "sword"라는 이름의 아이템과 해당 ItemData 객체를 추가합니다. 최대 개수는 3으로 초기화됩니다.

repository.put("shield", new ItemData(2));: repository에 "shield"라는 이름의 아이템과 해당 ItemData 객체를 추가합니다. 최대 개수는 2으로 초기화됩니다.

repository.put("bow", new ItemData(1));: repository에 "bow"라는 이름의 아이템과 해당 ItemData 객체를 추가합니다. 최대 개수는 1으로 초기화됩니다.

@Override: 부모 클래스(Factory)의 메서드를 오버라이드하고 있음을 나타냅니다.

public boolean isCreateable(String name) {: isCreateable 메서드를 정의합니다. 주어진 아이템 이름으로 아이템을 생성할 수 있는지 확인합니다.

ItemData itemDate = repository.get(name);: 주어진 이름에 해당하는 아이템 데이터를 가져옵니다.

if(itemDate == null) {: 아이템 데이터가 없는 경우를 처리합니다.

System.out.println(name + "은 알 수 없는 아이템 입니다.");: 해당 아이템이 없음을 알리는 메시지를 출력합니다.

return false;: 아이템을 생성할 수 없음을 반환합니다.

if(itemDate.currentCount >= itemDate.maxCount) {: 아이템의 현재 개수가 최대 개수를 초과하는 경우를 처리합니다.

System.out.println(name + "은 품절 아이템입니다.");: 해당 아이템이 품절임을 알리는 메시지를 출력합니다.

public Item createItem(String name) {: createItem 메서드를 정의합니다. 주어진 이름으로 아이템을 생성합니다.

Item item = null;: 아이템 객체를 초기화합니다.

if(name == "sword")item = new Sword();: 주어진 이름이 "sword"인 경우 Sword 객체를 생성합니다.

if(name == "shield")item = new Shield();: 주어진 이름이 "shield"인 경우 Shield 객체를 생성합니다.

if(name == "bow")item = new Bow();: 주어진 이름이 "bow"인 경우 Bow 객체를 생성합니다.

public void postprocessItem(String name) {: postprocessItem 메서드를 정의합니다. 아이템 생성 후 처리를 수행합니다.

ItemData itemData = repository.get((name));: 주어진 이름에 해당하는 아이템 데이터를 가져옵니다.

if(itemData != null) itemData.currentCount++;: 아이템 데이터가 있으면 현재 개수를 증가시킵니다.