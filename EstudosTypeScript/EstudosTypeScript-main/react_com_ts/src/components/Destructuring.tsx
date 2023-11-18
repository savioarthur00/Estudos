
import React, {ReactElement} from "react";

interface Props {
    title:string,
    content: string,
    commentsQty:number,
    tags:string[]

    //Enum
    category: Category
    
}

export enum Category{
    JS = "Java Script",
    TS = "Type Script",
    P = "Python"
}

const Destructuring = ({title,content,commentsQty,tags,category}:Props)=>{
    return (
        <div>
            <h1>{title}</h1>
            <p>{content}</p>
            <p>Quantidade de comentarios: {commentsQty}</p>
            <div>
                {tags.map(tag =>(
                    <span>
                        #{tag}
                    </span>
                ))}
            </div>

            <h4>Categoria: {category}</h4>
        </div>
    )
}
export default Destructuring



