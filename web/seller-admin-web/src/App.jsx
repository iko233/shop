// import {Route, Switch, Redirect} from 'react-router-dom'
import React, {useState} from 'react';
import 'antd/dist/antd.css';
import {Layout, Avatar} from 'antd';
import {
    MenuUnfoldOutlined,
    MenuFoldOutlined,
    UserOutlined
} from '@ant-design/icons';
import style from './App.css';
import BitMenu from './components/BitMenu'

const {Header, Sider, Content} = Layout;

const App = () => {
    const [collapsed, setCollapsed] = useState(false);
    const toggle = () => {
        setCollapsed(!collapsed);
    }
    return (
        <Layout>
            <Sider trigger={null} collapsible collapsed={collapsed} >
                <div className="logo"/>
                <BitMenu/>
            </Sider>
            <Layout className="site-layout">
                <Header className="site-layout-background">
                    {React.createElement(
                        collapsed ? MenuUnfoldOutlined : MenuFoldOutlined,
                        {className: 'trigger', onClick: toggle,}
                    )}
                    <Avatar size="large" icon={<UserOutlined/>} className={style.avatar} />
                </Header>
                <Content>
                    Content
                </Content>
            </Layout>
        </Layout>
    );
}

export default App;
