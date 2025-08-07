package ch05_7;

import java.util.*;

/**
 * 이벤트 처리를 위한 인터페이스 시스템
 */
// 이벤트 리스너 인터페이스
interface EventListener {
    void onEvent(Event event);
}

// 이벤트 클래스
class Event {
    private String type;
    private Object source;
    private long timestamp;
    private Map<String, Object> data;

    public Event(String type, Object source) {
        // TODO 75: type, source, timestamp 초기화하기
        // timestamp는 System.currentTimeMillis() 사용
        // data는 새 HashMap으로 초기화
        this.type = type;
        this.source = source;
        this.timestamp = System.currentTimeMillis();
        this.data = new HashMap<>();
    }

    // getter 메서드들
    public String getType() { return type; }
    public Object getSource() { return source; }
    public long getTimestamp() { return timestamp; }

    public void setData(String key, Object value) {
        // TODO 76: data에 key-value 추가하기
        data.put(key, value);
    }

    public Object getData(String key) {
        // TODO 77: data에서 key에 해당하는 값 반환하기
        return data.get(key);
    }
}

// 특정 이벤트 리스너들
interface ClickListener extends EventListener {
    @Override
    default void onEvent(Event event) {
        if ("click".equals(event.getType())) {
            onClick(event);
        }
    }

    void onClick(Event event);
}

// 이벤트 발생자 인터페이스
interface EventEmitter {
    void addEventListener(String eventType, EventListener listener);
    void removeEventListener(String eventType, EventListener listener);
    void emit(Event event);
}

// 버튼 클래스 - 이벤트 발생자
class Button implements EventEmitter {
    private String text;
    private Map<String, List<EventListener>> listeners;

    public Button(String text) {
        // TODO 78: text 초기화하고
        // listeners를 새 HashMap으로 초기화하기
        this.text = text;
        this.listeners = new HashMap<>();
    }

    @Override
    public void addEventListener(String eventType, EventListener listener) {
        // TODO 79: 이벤트 리스너 등록하기
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    @Override
    public void removeEventListener(String eventType, EventListener listener) {
        // TODO 80: 이벤트 리스너 제거하기
        // listeners.get(eventType)에서 listener 제거
        List<EventListener> list = listeners.get(eventType);
        list.remove(listener);
    }


    @Override
    public void emit(Event event) {
        // TODO 81: 이벤트 발생시키기
        // event.getType()에 해당하는 리스너들을 찾아서
        // 각각의 onEvent(event) 호출하기
        List<EventListener> list = listeners.get(event.getType());
        if (list != null) {
            for (EventListener listener : list) {
                listener.onEvent(event);
            }
        }
    }

    // 버튼 클릭 시뮬레이션
    public void click() {
        // TODO 82: 클릭 이벤트 생성하고 발생시키기
        // Event 생성 (type: "click", source: this)
        // event에 "button" 데이터로 text 추가
        // emit(event) 호출
        Event event = new Event("click", this);
        event.setData("button", text);
        emit(event);
    }

    public String getText() {
        return text;
    }
}

// 애플리케이션 - 이벤트 처리
public class Application {
    private Button saveButton;
    private Button cancelButton;

    public Application() {
        // TODO 83: 버튼 생성하기
        // saveButton: "저장"
        // cancelButton: "취소"
        saveButton = new Button("저장");
        cancelButton = new Button("취소");

        // TODO 84: 저장 버튼에 클릭 리스너 등록하기
        // ClickListener 구현체 생성 (익명 클래스)
        // onClick에서 "저장 버튼 클릭!" 출력하고 save() 호출
        saveButton.addEventListener("click", new ClickListener() {
            @Override
            public void onClick(Event event) {
                System.out.println("저장 버튼 클릭!");
                save();
            }
        });


        // TODO 85: 취소 버튼에 클릭 리스너 등록하기
        // 람다 표현식 사용
        // "취소 버튼 클릭!" 출력하고 cancel() 호출
        cancelButton.addEventListener("click", (event) -> {
            System.out.println("취소 버튼 클릭!");
            cancel();
        });
    }

    private void save() {
        System.out.println("데이터를 저장합니다...");
    }

    private void cancel() {
        System.out.println("작업을 취소합니다...");
    }

    public void run() {
        // TODO 86: 버튼 클릭 시뮬레이션하기
        saveButton.click();
        cancelButton.click();
    }

    public static void main(String[] args) {
        // TODO 87: Application 실행하기
        // Application 객체 생성하고 run() 호출
        Application app = new Application();
        app.run();
    }
}
