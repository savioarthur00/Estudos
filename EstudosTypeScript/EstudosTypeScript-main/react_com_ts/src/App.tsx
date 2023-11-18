import React,  {createContext}from 'react';
import FirstComponent from './components/FirstComponent';
import SecondComponent from './components/SecondComponent'
import Destructuring, {Category} from './components/Destructuring';
import State from './components/State';

import Context from './components/Context';


//Type

type TextOrNull = String | null
type Fixed = "Isso" | "Ou" | "Aquilo"

//context 
interface IAppContext{
  language: string,
    framework: string,
    projects: number
  
}

export const AppContext = createContext<IAppContext | null> (null)


function App() {
  //Variavés
  const name: string = "Sávio"
  const age: number = 23
  const isWorking: boolean = true

  // Funções 

  const userGreeting = (name:string):string => {
    return `Olá ${name}` 
  };

  //Type

  const myText:TextOrNull = "Tem algum texto aqui"
  let secondyText: TextOrNull = null

  //secondyText = "Opa"

  const testandoFixed: Fixed = "Aquilo"

  // context

  const contextValue: IAppContext = {
    language: "JavaScript",
    framework: "Express",
    projects: 5,
  }

  return (
    <AppContext.Provider value={contextValue}>

    
    <div className="App">
      <h1>TypeScript com React </h1>
      <h2>Nome: {name}</h2>
      <p>Idade {age}</p>
      {isWorking && (<p>Está trabalhando</p>)}

      <h3>
        {userGreeting(name)}
      </h3>
      <FirstComponent></FirstComponent>
      <SecondComponent name={'Segundo'}></SecondComponent>
      <Destructuring 
       title='Primeiro Post'
       content='Algum conteudo'
       tags={["ts","js"]} 
       commentsQty={10}
       category={Category.TS}
       ></Destructuring>
       <Destructuring 
       title='Segundo Post'
       content='Algum conteudo novo'
       tags={["Python"]} 
       commentsQty={5}
       category={Category.P}
       ></Destructuring>
       <State></State>

       {myText && 
          <p>Tem texto na váriavel</p>
       }
       {secondyText &&
       <p>Tem texto na váriavel</p>

       }
       <Context />
        
       
    </div>
    </AppContext.Provider>


  );
}

export default App;
