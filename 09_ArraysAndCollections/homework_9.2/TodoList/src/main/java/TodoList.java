import java.util.ArrayList;

public class TodoList {


    ArrayList<String> todoList = new ArrayList<>();


    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);

    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index <= todoList.size()) {
            todoList.add(index, todo);


        } else {
            todoList.add(todo);

        }

    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index <= todoList.size()) {
            todoList.set(index, todo);
            System.out.println("Дело " + index + " заменено на " + todo);

        }


    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index < todoList.size()) {
            todoList.remove(index);
            System.out.println("Дело " + '"' + index + '"' + " удалено");
        }
        if (index > todoList.size()) {
            System.out.println("Дело с таким номером не существует");
        }

    }

    public ArrayList<String> getTodos() {
        for(int i = 0; i < todoList.size(); i++){
            System.out.println(todoList.get(i));
        }
        // TODO: вернуть список дел

        return todoList;
    }

}