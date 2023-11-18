import React, { useState } from 'react';
import Header from './components/Header';
import Footer from './components/Footer';
import TaskForm from './components/TaskForm';
import  styles  from "./App.module.css";
import TaskList from './components/TaskList';

import { ITask } from './interfaces/Task';
import Modal from './components/Modal';

function App() {
  
  const [taskList, setTaskList]=useState<ITask[]>([])
  const [taskToUpdate, setTaskToUpdate] = useState<ITask | null>(null);


  
  const deleteTask = (nome: string): void => {
    setTaskList(
      taskList.filter((task) => {
        return task.nome !== nome;
      })
    );
  };

  const hideOrShowModal = (display: boolean) => {
    const modal = document.getElementById("modal");
    if (display) {
      modal!.classList.remove("hide");
    } else {
      modal!.classList.add("hide");
    }
  };

  const editTask = (task: ITask): void => {
    hideOrShowModal(true);
    setTaskToUpdate(task);
  };

  
  return (
    <div>
        <Modal children={<TaskForm btnText="Editar tarefa" taskList={taskList}/>} />
        <Header />

        <main className={styles.main}>

        <div>
          <h2>Cadastro de Sócio</h2>
          <TaskForm btnText='Criar Sócio' taskList={taskList} setTaskList={setTaskList}/> 
        </div>

        <div>
          <h2>Lista Sócios</h2>
          <TaskList taskList={taskList}  handleDelete={deleteTask}
            handleEdit={editTask} />
        </div>
        </main>
        <Footer />

    </div>
  );
}

export default App;
