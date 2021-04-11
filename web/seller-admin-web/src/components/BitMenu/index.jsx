import {UserOutlined} from "@ant-design/icons";
import {Link} from 'react-router-dom'
import React, {useState} from "react";
import {Menu} from 'antd';
import {useEffect} from "react";
import Axios from 'axios'
const BitMenu=()=>{
    const path=window.document.location.pathname;
    const [item,setItem]=useState([]);
    const getItem=()=>{
        Axios.get(`/api/menu`)
            .then(res=>{

            });
    }
    useEffect(() => {
        getItem();
    }, []);
    return (
        <Menu theme="dark" mode="inline" defaultSelectedKeys={[path]}>
            <Menu.Item key="/" icon={<UserOutlined/>}>
                <Link to='/'>首页</Link>
            </Menu.Item>
        </Menu>
    );

}
export default BitMenu;
