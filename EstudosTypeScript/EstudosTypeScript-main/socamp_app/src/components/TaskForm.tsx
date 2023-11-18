import React, {useState, ChangeEvent,FormEvent,useEffect}  from 'react';
import styles from './TaskForm.module.css'
import { ITask } from '../interfaces/Task';


interface Props {
    btnText: string,
    taskList: ITask[],
    setTaskList?: React.Dispatch<React.SetStateAction<ITask[]>>
  
}

const TaskForm = ({btnText, setTaskList , taskList}: Props)=>{
  

    const [id,setId] = useState<number>(0)
    const [nome,setNome] = useState<string>("")
    const [formaDePagamento,setFormaDePagamento] = useState<string>("")

    const addTaskHandler  = (e:FormEvent<HTMLFormElement>) => {

        e.preventDefault();

        const id = Math.floor(Math.random()*1000)
        const newTask: ITask = {id,nome,formaDePagamento}
        

        setTaskList!([... taskList,newTask])

        setNome(""),
        setFormaDePagamento("")

    }


    const handleChange  = (e: ChangeEvent<HTMLInputElement>) => {
        if(e.target.name === "title"){
            setNome(e.target.value)
        }else{
            setFormaDePagamento((e.target.value))
        }


    }

    return <form onSubmit={addTaskHandler} className={styles.form}>

        <div className={styles.input_container}>
        <label htmlFor="Sócio">Titulo</label>
        <input type="text" name="title" placeholder="Nome do sócio" onChange={handleChange} value={nome} />
        </div>

         <div className={styles.input_container}>
        <label htmlFor="Forma de pagamento">Difilculdade</label>
        <input type="text" name="difficulty" placeholder="Forma de pagamento" value={formaDePagamento} />
        </div>

        <input type = "submit" value= {btnText}></input>
         
    </form>
  
}

export default TaskForm