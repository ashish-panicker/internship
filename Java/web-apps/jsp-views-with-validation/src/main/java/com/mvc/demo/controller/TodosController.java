package com.mvc.demo.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.mvc.demo.model.Todo;
import com.mvc.demo.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/todos")
public class TodosController {

    @Autowired
    private TodoService todoService;

    /**
     * URL: GET /todos, GET /todos/, GET /todos/all
     * 
     * @return ModelAndView
     */
    @GetMapping({ "/", "", "all" })
    public ModelAndView onGet() {
        ModelAndView viewModel = new ModelAndView("todos", "todos", todoService.getTodoList());
        todoService.getTodoList().forEach(System.out::println);
        return viewModel;
    }

    /**
     * URL: GET /todos/new
     * 
     * @return ModelAndView
     */
    @GetMapping("/new")
    public ModelAndView showTodoPageOnGet() {
        return new ModelAndView("todo-form", "todo", new Todo());
    }

    /**
     * URL: POST /todos/new
     * 
     * @return 
     */
    @PostMapping("/new")
    public String createTodoOnPost(@Valid @ModelAttribute("todo") Todo todo, BindingResult result) {
        if(!result.hasErrors()){
            todoService.addTodo(todo);
        }
        return "redirect:/";
    }

}
