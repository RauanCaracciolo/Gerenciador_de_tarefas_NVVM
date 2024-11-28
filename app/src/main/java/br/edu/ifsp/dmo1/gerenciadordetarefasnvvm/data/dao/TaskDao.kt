package br.edu.ifsp.dmo1.gerenciadordetarefasnvvm.data.dao

import br.edu.ifsp.dmo1.gerenciadordetarefasnvvm.data.model.Task

object TaskDao {
    private var tasks: MutableList<Task> = mutableListOf()
    fun add(task: Task){
        tasks.add(task)
    }
    fun getAll() = tasks

    fun get(id:Long): Task?{
        return tasks.stream()
            .filter{t->t.id == id}
            .findFirst()
            .orElse(null)
    }
}