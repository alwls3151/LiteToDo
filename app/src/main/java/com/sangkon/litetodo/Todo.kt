package com.sangkon.litetodo

// card_view의 한칸을 출력하기 위해선 Todo 객체가 필요하다.

// activity main 을 실행하면 화면에 todo 까지 띄우는 것은 문제가 없는데 FragmentContainerView 를 화면에 띄우려고 하니까 app_nav가 필요하다는 것을 안드로이드가 인지한다.
// app_nav.xml 로 가면 fragment_todo_list 파일을 읽어서 화면에 띄워줘 라고 되어있다.
// 그래서 fragment_todo_list.xml 로 가보면 화면이 RecyclerView 로 화면을 띄우게 되어있다. 근데 화면에 하나하나 뜨는것은 todo_card_view이다.
// 결론적으로 todo_card_view 가 일단 컴파일이 되어야 fragment_todo_list이 컴파일이 되고, 그 다음 activity_main 이 컴파일이 된다.

// 첫번째, 일단 Todo를 data class 로 만든다.
data class Todo(val id: Int = generatedId(), val date: String, val task: String) {
    companion object {
        private var currentId: Int = 0
        private fun generatedId(): Int {
            return ++currentId
        }
    }
}