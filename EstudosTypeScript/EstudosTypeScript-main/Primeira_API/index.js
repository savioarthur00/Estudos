const express = require('express')
const app = express()

app.use(
    express.urlencoded({
        extended:true
    })
)

app.use(express.json())


//rotas e endpoints
app.post('/createdProduct', (req,res)=>{
    const name= req.body.name
    const price = req.body.price

    console.log(name)
    console.log(price)
    res.status(201).json({message:'Produto encontrado'})

})


app.get('/', (req,res)=>{
    res.json({message:'Primeira rota criada'})
})

app.listen(3000)