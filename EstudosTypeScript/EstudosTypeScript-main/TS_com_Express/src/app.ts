//console.log("Type com Express")

import express, {NextFunction, Request,Response} from 'express'

const app = express()

app.use(express.json());

// Middlewere para todos 
//Middlewere necessita do next

function showPath(req:Request,res:Response,next:NextFunction){
    console.log(req.path)
    next()
}

app.use(showPath)


app.get("/",(req,res)=>{
    return res.send("Hello express!")
})


//Api All
app.all("/api/product/check", (req,res)=>{

    //req.Method = Verbo http

    if(req.method === "POST"){
        return res.send("Inseriu registro")
    }else if(req.method === "GET"){
        return res.send("Registro Lido")
    }else{
        return res.send("Não foi possivel concluir operação")
    }


})


//Api Post
app.post("/api/product" ,(req,res)=>{

    console.log(req.body)

    return res.send("Produto adicionado")

})

//Interfaces 
app.get("/api/interfaces", (req:Request,res:Response)=>{
    return res.send("Utilizando interfaces ")
})

//JSON

app.get("/api/json", (req:Request,res:Response)=>{
    
    return res.json({
        name:"Shirt",
        price: "30",
        color: "blue",
        size: ["p","m","g"] 
    })


})

// Router Parameters

app.get("/api/product/:id", (req:Request,res:Response)=>{
   
    const id = req.params.id

    if(id==="1"){

        const product = {
            id: 1,
            name: "Boné",
            price: 10
        }
        return res.json(product)

    }else{
    return res.send("Produto não encontrado")
    }
})

// Rotas complexas

app.get("/api/product/:productId/review/:reviewId", (req:Request,res:Response)=>{

    const productId = req.params.productId
    const reviewID = req.params.reviewId

    return res.send(`acessando a review ${reviewID} do produto ${productId}`)
})


// Router Handler // Uso de funções // Bastante utilizado

function getUser(req:Request, res:Response){

    console.log(`resgatando o usuario com id: ${req.params.id}`)
    return res.send("O usuario foi encontrado")

}

app.get("/api/user/:id", getUser);

// Router Middleware // checando se está logado, se tem acesso...

function checkUser(req:Request,res:Response,next:NextFunction){
    if(req.params.id==="1"){
        console.log("SEGUE!!")
        next()
    }else{
        console.log("Acesso negado!")
    }

}

app.get("/api/user/:id/access", checkUser, (req:Request,res:Response)=>{

    return res.json({msg:"Bem vindo a area administrativa"})
});

// Req e Res com Generics 

app.get("/api/user/:id/details/:name", (req:Request<{id:string,name:"string"}>,res:Response<{status:boolean}>)=>{

    console.log(`Id:  ${req.params.id}`)
    console.log(`Nome: ${req.params.name}`)

    return res.json({status:true})


})

// Tratando erros 

app.get("/api/error",(req:Request,res:Response)=>{

    try {
        throw new Error("Algo deu errado")
    } catch (e: any) {
        res.status(500).json({msg: e.message})
    }

})






app.listen(3000,()=>{
    console.log("Aplicação de TS + Express funcionario")
})
